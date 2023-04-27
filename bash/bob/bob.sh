#!/usr/bin/env bash

# if it is all uppercase
is_shouting () {
    [[ "${1}" =~ [[:alpha:]] ]] && [[ "${1}" == "${1^^}" ]]
}

# if it ends with question mark
is_question () {
    [[ "${1}" == *"?" ]]
}

# if it is all uppercase and ends with question mark
is_shouting_question () {
    is_shouting "${1}" && is_question "${1}"
}

main () {
    local statement="${1//[[:space:]]/}"
    if [[ "${statement}" == "" ]]
    then
        echo "Fine. Be that way!"
    elif is_shouting_question "${statement}"
    then
        echo "Calm down, I know what I'm doing!"
    elif is_shouting "${statement}"
    then
        echo "Whoa, chill out!"
    elif is_question "${statement}"
    then
        echo "Sure."
    else
        echo "Whatever."
    fi
}

main "$@"
