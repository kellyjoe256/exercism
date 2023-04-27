#!/usr/bin/env bash

main () {
    local number_count=${#1}
    local sum=0
    for (( i = 0; i < number_count; i += 1 ))
    do
        number=${1:$i:1}
        (( sum += number ** number_count ))
    done

    (( sum == $1 )) && echo "true" || echo "false"
}

main "$@"
