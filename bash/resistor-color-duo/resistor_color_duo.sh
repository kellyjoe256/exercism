#!/usr/bin/env bash

main () {
    local output=''
    readonly -A color_values=(
        black  0
        brown  1
        red    2
        orange 3
        yellow 4
        green  5
        blue   6
        violet 7
        grey   8
        white  9
    )
    for i in {1..2}
    do
        color="${!i}"
        if [[ -v color_values["${color,,}"] ]]
        then
            output+="${color_values[${color,,}]}"
        else
            echo "invalid color"
            return 1
        fi
    done

    echo $(( 10#${output} ))
}

main "$@"
