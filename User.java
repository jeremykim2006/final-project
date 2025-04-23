public class User {
    private String name;
    private int age;
    private double weight; 
    private double height; 
    private String gender;
    private String activityLevel;

    public User(String name, int age, double weight, double height, String gender, String activityLevel) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.activityLevel = activityLevel;
    }

    public double calculateBMR() {
        double bmr;
        if (gender.equalsIgnoreCase("male")) {
            bmr = 88.36 + (13.4 * weight) + (4.8 * height) - (5.7 * age);
        } else {
            bmr = 447.6 + (9.2 * weight) + (3.1 * height) - (4.3 * age);
        }
        return bmr * getActivityFactor();
    }

    private double getActivityFactor() {
        String level = activityLevel.toLowerCase();
        if (level.equals("sedentary")) {
            return 1.2;
        } else if (level.equals("light")) {
            return 1.375;
        } else if (level.equals("moderate")) {
            return 1.55;
        } else if (level.equals("active")) {
            return 1.725;
        } else if (level.equals("very active")) {
            return 1.9;
        } else {
            return 1.2;
        }
    }
}
