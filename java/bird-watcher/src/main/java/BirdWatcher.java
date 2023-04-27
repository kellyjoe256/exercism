class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int[] lastWeek = new int[7];
        for (int i = 0; i < 7; i++) {
            lastWeek[i] = birdsPerDay[i];
        }

        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[this.lastIndex()];
    }

    public void incrementTodaysCount() {
        birdsPerDay[lastIndex()] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birdsCount: birdsPerDay) {
            if (birdsCount == 0) {
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }

        for (int i = 0; i < numberOfDays; i += 1) {
            count += this.birdsPerDay[i];
        }

        return count;
    }

    public int getBusyDays() {
        int numberOfBusyDays = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                numberOfBusyDays++;
            }
        }

        return numberOfBusyDays;
    }

    private int lastIndex() {
        return this.birdsPerDay.length - 1;
    }
}
