#!/usr/bin/env bash

usage () {
    echo "Usage: $(basename "$0") <string1> <string2>"
}

main () {
    if (( $# < 2 ))
    then
        usage
        return 1
    fi

    strand1_length=${#1}
    strand2_length=${#2}
    if (( strand1_length != strand2_length ))
    then
        echo "strands must be of equal length"
        return 1
    fi

    distance=0
    for (( i = 0; i < strand1_length; i++ ))
    do
        [[ "${1:$i:1}" != "${2:$i:1}" ]] && (( distance++ ))
    done

    echo "$distance"
}

main "$@"
