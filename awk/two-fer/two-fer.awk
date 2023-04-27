BEGIN {
    name="you"
    if (ARGV[1] != "")
    {
        name=ARGV[1]
    }

    print "One for $name, one for me."
    exit 1
}
