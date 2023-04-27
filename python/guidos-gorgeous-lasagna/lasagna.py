"""Some code to help you cook a gorgeous lasagna from your favorite cookbook.
"""


PREPARATION_TIME = 2
EXPECTED_BAKE_TIME = 40


def bake_time_remaining(elapsed_bake_time: int) -> int:
    """Calculate the bake time remaining.

    :param elapsed_bake_time: int - baking time already elapsed.
    :return: int - remaining bake time (in minutes) derived from 'EXPECTED_BAKE_TIME'.

    Function that takes the actual minutes the lasagna has been in the oven as
    an argument and returns how many minutes the lasagna still needs to bake
    based on the `EXPECTED_BAKE_TIME`.
    """

    return EXPECTED_BAKE_TIME - elapsed_bake_time


def preparation_time_in_minutes(number_of_layers: int) -> int:
    """Calculate the preparation time in minutes.

    :param number_of_layers: int - the number of layers you want to add to the lasagna.
    :return: int - how many minutes you would spend making them; calculated from 'PREPARATION_TIME'.

    Function that takes the number of layers that need to be added to lasagna has as
    an argument and returns the preparation time in minutes
    based on the `PREPARATION_TIME`.
    """

    return PREPARATION_TIME * number_of_layers


def elapsed_time_in_minutes(number_of_layers: int, elapsed_bake_time: int) -> int:
    """Calculate elapsed time in minutes.

    :param number_of_layers: int - the number of layers added to the lasagna.
    :param elapsed_bake_time: int - the number of minutes the lasagna has been baking in the oven.
    :return: int - the total number of minutes you've been cooking, or the sum of your preparation time and the time the lasagna has already spent baking in the oven.
    """

    return preparation_time_in_minutes(number_of_layers) + elapsed_bake_time
