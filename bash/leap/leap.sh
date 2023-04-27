#!/usr/bin/env bash

usage () {
    printf 'Usage: %s <year>' "${BASH_SOURCE[0]}"
}

is_invalid_input () {
    # if no arguments, or more than one argument is provided, or is not a decimal number
    (( $# != 1 )) || [[ "${1}" =~ [^[:digit:]] ]]
}

main () {
    local year="${1}"
    if is_invalid_input "$@"
    then
        usage
        return 1
    fi

    if (( year % 400 == 0 ))
    then
        echo "true"
    elif (( year % 100 == 0 ))
    then
        echo "false"
    elif (( year % 4 == 0 ))
    then
        echo "true"
    else
        echo "false"
    fi
}

main "$@"
