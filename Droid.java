public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid " + name + ".";
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task + ".");
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(batteryLevel);
    }

    public void energyTransfer(Droid otherDroid, int energyToTransfer) {
        this.batteryLevel = this.batteryLevel - energyToTransfer;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.energyReport();

        Droid astro = new Droid("Astro");
        System.out.println(astro);
        astro.energyReport();
        astro.energyTransfer(codey, 5);
        astro.energyReport();
        codey.energyReport();
    }
}