package prac4.task1;

enum Season {
    WINTER(-5.0, "WINTER"),
    SPRING(10.0, "SPRING"),
    SUMMER(25.0, "SUMMER") {
        @Override
        public String getDescription() {
            return "Warm time of the year";
        }
    },
    AUTUMN(5.0, "AUTUMN");

    private final double averageTemperature;
    private final String name;

    Season(double averageTemperature, String name) {
        this.averageTemperature = averageTemperature;
        this.name = name;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "Warm time of the year";
    }
}





