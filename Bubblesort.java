class Bubblesort {
    public static void main (String[] args) {
	int[] a = {4,8,3,5,2,9,1,6,7};
	for(int i = 0;i < a.length-1;i++) {
	    for(int j = 0;j < a.length-i-1;j++) {
	        if(a[j] > a[j+1]) {
		    int asc = a[j];
                    a[j] = a[j+1];
                    a[j+1] = asc;
                }
            }
        }
        

        for(int i = 0;i < a.length;i++) {
              System.out.println(a[i]+" ");
        }
    
    }
}
