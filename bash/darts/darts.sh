#!/usr/bin/env bash

main () {
    if (( $# != 2 )) || [[ "$*" =~ [[:alpha:]] ]]
    then
        echo "Usage: ${BASH_SOURCE[0]} <x:number> <y:number>"
        return 1
    fi

    local x="${1}" y="${2}"
    bc << EOF
    scale=4
    result=sqrt(${x}^2 + ${y}^2)
    if (result <= 1) {
        10
    } else if (result <= 5) {
        5
    } else if (result <= 10) {
        1
    } else {
        0
    }
EOF
}

main "$@"
