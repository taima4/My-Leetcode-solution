class Solution {
    public boolean containsDuplicate(int[] a) {
       boolean x=false;
        Arrays.sort(a);
        for (int i = 0; i <a.length-1 ; i++) {
            if (a[i]==a[i+1]){
                x=true;
                break;
            }

        }
        return x; 
    }
}