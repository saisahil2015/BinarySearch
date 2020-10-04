class BinarySearch {


    public int binary(int[] keys, int key) {

        int left = 0;
        int right = keys.length - 1;
        int mid;


       while(true){

           if (left > right){

               mid = -1;
               break;
           }
           else{

               mid = (left + right)/2;

               if(key < keys[mid]){

                   right = mid - 1;
               }

               else if (key > keys[mid]){

                   left = mid + 1;
               }

               else{


                   break;
               }


           }




       }

    return mid;


    }
    public static void main(String args[]) {

        BinarySearch search = new BinarySearch();
        int[] array = {2, 4, 5, 6, 7};
        int result = search.binary(array, 4);
        System.out.println(result);
        if (result == -1) {

            System.out.println("This is something dumb");
        } else {
            System.out.println("This is some great stuff");

        }
    }

}
