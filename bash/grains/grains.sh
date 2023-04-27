#!/usr/bin/env bash

calculate_grains_on_square () {
    local square="${1}"

    echo "2 ^ (${square} - 1)" | bc
}

calculate_total_grains_on_all_squares () {
    local total_grains=0
    for (( i = 1; i <= 64; i++ ))
    do
        total_grains=$(echo "${total_grains} + 2 ^ (${i} - 1)" | bc)
    done

    echo "${total_grains}"
}

main () {
    local square="${1}"
    if [[ "${square,,}" == *"total"* ]]
    then
        calculate_total_grains_on_all_squares
        return 0
    fi

    if (( square < 1 )) || (( square > 64 ))
    then
        echo "Error: invalid input"
        return 1
    fi

    calculate_grains_on_square "${square}"
}

main "$@"
