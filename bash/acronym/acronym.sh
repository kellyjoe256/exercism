#!/usr/bin/env bash

main () {
    # remove non alphanumeric characters from provided string, leaving the apostrophe
    string="${1//[^\'[:alnum:]]/ }"
    # split the cleansed string into an array of words by the space delimiter
    IFS=" " read -r -a words <<< "${string}"
    acronym=""
    for word in "${words[@]}"
    do
        # get the first character of a word
        character=${word:0:1}
        # check if character is an alphabet letter
        if [[ "${character}" =~ [a-zA-Z] ]]
        then
            # append letter character to acronym, after converting it uppercase
            acronym+=${character^}
        fi
    done

    echo "${acronym}"
}

main "$@"
