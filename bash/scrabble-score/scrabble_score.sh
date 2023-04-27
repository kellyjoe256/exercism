#!/usr/bin/env bash

is_letter_in_string () {
    string="${1,,}" # get and convert all string letters to lowercase
    letter="${2,,}" # get and convert letter to lowercase
    [[ "${string}" == *"${letter}"* ]]
}

get_letter_score () {
    local score=0
    local letter="${1}"
    local -A letter_scores=(
        ['AEIOULNRST']=1
        ['DG']=2
        ['BCMP']=3
        ['FHVWY']=4
        ['K']=5
        ['JX']=8
        ['QZ']=10
    )
    for letters in "${!letter_scores[@]}"
    do
        if is_letter_in_string "${letters}" "${letter}"
        then
            score="${letter_scores[${letters}]}"
            break
        fi
    done

    echo "${score}"
}

main () {
    local score=0
    local word="${1}"
    for (( i = 0, word_length=${#word}; i < word_length; i += 1 ))
    do
        letter=${word:i:1}
        letter_score=$(get_letter_score "${letter}")
        (( score += letter_score ))
    done

    echo "${score}"
}

main "$@"
