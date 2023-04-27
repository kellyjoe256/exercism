#!/usr/bin/env bash

main () {
    # make alphabet readonly
    local -r alphabet=({a..z})
    # remove non-alphabet characters from provided string
    local sentence="${1//[^[:alpha:]]/}"
    # check if provided string length is less than the number of alphabet characters
    if (( ${#sentence} < ${#alphabet[@]} ))
    then
        echo "false"
        return 0
    fi

    # convert entire sentence to lowercase
    sentence="${sentence,,}"
    for letter in "${alphabet[@]}"
    do
        # check if letter is not provided sentence
        if [[ "${sentence}" != *"${letter}"* ]]
        then
            echo "false"
            return 0
        fi
    done

    echo "true"
}

main "$@"
