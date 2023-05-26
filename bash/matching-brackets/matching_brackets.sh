#!/usr/bin/env bash

main () {
    local string="${1//[^\[\{\(\]\}\)]/}"
    local -rA brackets=( ['[']=']' ['{']='}' ['(']=')' )
    while [[ "${string}" ]]
    do
        bracket="${string:0:1}"
        # get matching bracket for first bracket
        matching="${brackets[${bracket}]}"
        # get next bracket, after first
        next_bracket="${string:1:1}"
        # get last bracket
        last_bracket="${string:(-1)}"
        if [[ "${next_bracket}" ]] && [[ "${next_bracket}" == "${matching}" ]]
        then
            # if string is '{}[]()', it will now be '[]()'
            string="${string:2}"
        elif [[ "${last_bracket}" ]] && [[ "${last_bracket}" == "${matching}" ]]
        then
            # if string is '[()]', it will now be '()'
            string="${string:1:(-1)}"
        else
            echo 'false'
            return 0
        fi
    done

    echo 'true'
}

main "$@"
