#!/usr/bin/env bash

main () {
    for (( i = ${#1} - 1; i >= 0; i -= 1 ))
    do
        printf '%s' "${1:i:1}"
    done
}

main "$@"
