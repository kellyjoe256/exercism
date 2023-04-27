#!/usr/bin/env bash

main () {
    if ! [[ "$1" =~ ^-?[0-9]+$ ]]
    then
        echo "Error: Please provide an integer"
        echo "Usage: $(basename "$0") <integer>"
        return 1
    fi

    output=""
    (( $1 % 3 == 0 )) && output="Pling"
    (( $1 % 5 == 0 )) && output+="Plang"
    (( $1 % 7 == 0 )) && output+="Plong"

    echo ${output:-$1}
}

main "$1"
