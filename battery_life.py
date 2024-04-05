class Battery:
    def __init__(self, initial_capacity):
        self.capacity = initial_capacity

    def discharge(self, usage):
        self.capacity -= usage

    def charge(self, amount):
        self.capacity += amount

    def get_percentage(self, max_capacity):
        return (self.capacity / max_capacity) * 100

# Example usage:
if __name__ == "__main__":
    initial_capacity = float(input("Enter initial capacity of the battery: "))
    max_capacity = float(input("Enter maximum capacity of the battery: "))

    battery = Battery(initial_capacity)

    print("Battery Percentage:", battery.get_percentage(max_capacity))
