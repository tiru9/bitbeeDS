package DesignPatterns;

// Product Class
class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private boolean isGraphicsEnabled;
    private boolean isBluetoothEnabled;

    // Private Constructor
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isGraphicsEnabled = builder.isGraphicsEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage +
                ", Graphics=" + isGraphicsEnabled + ", Bluetooth=" + isBluetoothEnabled + "]";
    }

    // Static Inner Builder Class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private boolean isGraphicsEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder enableGraphics(boolean isGraphicsEnabled) {
            this.isGraphicsEnabled = isGraphicsEnabled;
            return this;
        }

        public Builder enableBluetooth(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

// Client Code
public class BuilderPatternClient {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .enableGraphics(true)
                .enableBluetooth(false)
                .build();

        System.out.println(computer);
        // Output: Computer [CPU=Intel i7, RAM=16GB, storage=1TB SSD, Graphics=true, Bluetooth=false]
    }
}

