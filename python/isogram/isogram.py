def is_isogram(string):
    string_in_lower_case = string.casefold()
    unique_string_characters = set(string_in_lower_case)

    return all(
        string_in_lower_case.count(character) == 1
        for character in unique_string_characters
        if character.isalpha()
    )
