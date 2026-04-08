class Patient {
    private String pId;
    private String name;
    private int age;
    private double heartrate;
    private String bp;

    Patient(String pId, String name, int age, double heartrate) {
        this.pId = pId;
        this.name = name;
        setAge(age); 
	setHeartrate(heartrate);
    }

    public void setHeartrate(double rate) {
        if (rate >= 40 && rate <= 180) {
            this.heartrate = rate;
            System.out.println("Heart rate has been set.");
        } else {
            System.out.println("Update rejected - invalid heart rate: "+rate);
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age: "+age);
        }
    }

    public String getpId() {
        return pId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeartrate() {
        return heartrate;
    }


    public void display() {
        System.out.println("----Patient Details----");
        System.out.println("ID: " + pId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heart Rate: " + heartrate);
	System.out.println("-----------------------");
    }
}

public class encap {
    public static void main(String[] args) {
        Patient p1 = new Patient("A001", "alex", 60,60.0);
	Patient p2 = new Patient("A002","alexa",45,78);

        p1.setHeartrate(75);
        p1.display();

        p2.setHeartrate(200);
	p2.setAge(-3);
	p2.display();

	System.out.println("Patient 1 ID: "+p1.getpId());
	System.out.println("Patient 2 Name: "+p2.getName());


    }
}