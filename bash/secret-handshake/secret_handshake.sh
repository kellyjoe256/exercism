#!/usr/bin/env bash

convert_to_binary () {
    binary=''
    number="$1"
    while (( number > 0 ))
    do
        binary=$(( number % 2 ))$binary
        number=$(( number / 2 ))
    done

    printf '%05s' "${binary}"
}

main () {
    if (( $1 == 0 ))
    then
        return 0
    fi

    local binary
    local range
    local output=''
    local -ra handshakes=('jump' 'close your eyes' 'double blink' 'wink')
    binary=$(convert_to_binary "${1}")
    binary=${binary// /0}
    [[ "${binary:0:1}" == '1' ]] && range="{0..3}" || range="{3..0}"
    for index in $(eval echo "${range}")
    do
        bit="${binary:index+1:1}"
        handshake="${handshakes[index]}"
        if [[ "${bit}" != '0' ]]
        then
           output+="${handshake},"
        fi
    done

    if [[ "${output}" == '' ]]
    then
        return 0
    fi

    # remove last comma
    echo "${output::-1}"
}

main "$@"
