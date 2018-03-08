 class Scope {
        public static String message = "Hello";
        public static Boolean shouldLoop = false;

        public static void main(String args[]) {
            int i = 1;
            int n = 1;

            while(i <= 10) {
                n = i * 2;
                System.out.println(n);
                i++;
            }

            if(n > 10) {
                System.out.println(message);
            }

            Boolean shouldLoop = false;
            i = 0;
            while(shouldLoop) {
                if(i < 10) {
                    System.out.println(message);                    
                } else {
                    shouldLoop = false;
                }
                i++;
            }

            String message = "Hello World";
            for(i = 0; i < message.length(); i++) {
            if(message.charAt(i) == 'W') {
                System.out.println("W found at index " + i);
                break;
            }
        }
    }
 }