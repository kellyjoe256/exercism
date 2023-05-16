#!/usr/bin/env bash

main () {
    if (( $1 == 0 ))
    then
        return 0
    fi

    local -a output=()
    local -r number=$1
    local -ra handshakes=('jump' 'close your eyes' 'double blink' 'wink')
    local number_of_bits=$(( (${#handshakes[@]} + 1) - 1 ))
    local -r initial_bit=$(( (number >> number_of_bits) & 1 ))
    number_of_bits=$(( number_of_bits - 1 ))
    for index in "${!handshakes[@]}"
    do
        (( initial_bit == 1 )) && temp=$(( number_of_bits - index )) || temp=$index
        bit=$(( (number >> temp) & 1 ))
        if (( bit == 1 ))
        then
            (( initial_bit == 1 )) && subscript=$index || subscript=$(( (index * -1) + -1 ))
            output+=("${handshakes[subscript]}")
        fi
    done

    local IFS=','
    echo "${output[*]}"
}

main "$@"
