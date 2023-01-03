class Solution {
    public String getHint(String secret, String guess) {
        int sfre[] = new int[10];
        int gfre[] = new int[10]; 

        int bulls = 0;
        int cows = 0;

        for(int i = 0; i<secret.length(); i++){
            int s = secret.charAt(i);
            int g = guess.charAt(i);
            if(s==g)
                bulls++;
            else{
                sfre[s-'0']++;
                gfre[g-'0']++;
            }
        }
        for(int i = 0; i<10; i++){
            cows+=Math.min(sfre[i],gfre[i]);
        }

        return Integer.toString(bulls)+'A'+ Integer.toString(cows)+'B';
        
    }
}
