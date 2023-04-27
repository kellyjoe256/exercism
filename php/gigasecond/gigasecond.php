<?php

function from(DateTimeImmutable $date): DateTimeImmutable
{
    return $date->add(DateInterval::createFromDateString('1000000000 seconds'));
}
