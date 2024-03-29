class Queue:
    def __init__(self):
        self.elements = []

    def enqueue(self, item):
        self.elements.append(item)

    def dequeue(self):
        if self.is_empty():
            raise Exception("Queue is empty")
        return self.elements.pop(0)

    def peek(self):
        if self.is_empty():
            raise Exception("Queue is empty")
        return self.elements[0]

    def is_empty(self):
        return len(self.elements) == 0

    def size(self):
        return len(self.elements)
    def main():
        queue = Queue()

        # Enqueue elements
        queue.enqueue(10)
        queue.enqueue(20)
        queue.enqueue(30)

        # Dequeue an element
        dequeued = queue.dequeue()
        print("Dequeued element:", dequeued)  # Output: Dequeued element: 10

        # Peek at the front element
        front_element = queue.peek()
        print("Front element:", front_element)  # Output: Front element: 20

        # Check if the queue is empty
        empty = queue.is_empty()
        print("Is the queue empty?", empty)  # Output: Is the queue empty? False

        # Get the size of the queue
        size = queue.size()
        print("Size of the queue:", size)  # Output: Size of the queue: 2


    if __name__ == "__main__":
        main()
