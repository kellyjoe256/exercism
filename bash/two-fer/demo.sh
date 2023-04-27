#!/bin/bash
read -p "Enter your age: " age
# read -s -p "Enter your password: " password
(( $age == 25 )) && res="yes" || res="no"
echo "Elgibility: $res"
# echo "Password: $password"
