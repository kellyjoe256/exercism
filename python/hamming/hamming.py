def distance(strand_a, strand_b):
    if len(strand_a) != len(strand_b):
        raise ValueError("Strands must be of equal length.")

    return sum(
        0 if a == b else 1
        for a, b in zip(strand_a, strand_b)
    )
