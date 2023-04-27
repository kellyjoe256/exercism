#!/usr/bin/env bash

usage () {
    echo "Usage: $(basename "${0}") <person>"
}

main () {
    if (( $# != 1 ))
    then
        usage
        return 1
    fi

    echo "Hello, $1"
}

main "$@"
