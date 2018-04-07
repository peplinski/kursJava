package pl.kurs.marzec.listImplementation;

    class Node {
        public Integer element;
        public Node next;

        public Node(Integer e) {
            element = e;
        }
    }

    class MyLinkedList {
        private Node firstElement;
        private int index = 0;

        public int get(int i) throws Exception {
            return getNode(i).element;
        }

        private Node getNode(int i) {
            Node n = firstElement;
            for (int j = 0; j != i && n.next != null; j++) {
                n = n.next;
            }

            return n;
        }

        public void add(Integer x) {
            Node n = getNode(1000);
            if (n == null) {
                n = new Node(x);
            } else {
                n.next = new Node(x);
            }
        }
    }

