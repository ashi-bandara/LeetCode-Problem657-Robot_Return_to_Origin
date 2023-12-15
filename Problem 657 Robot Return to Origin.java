class Solution {
    public boolean judgeCircle(String moves) {
        int LR_Present = 0, UD_Present = 0;
        char[] movesArray = moves.toCharArray();

        for (int i=0; i<moves.length(); i++){
            if(movesArray[i]=='L'){
                LR_Present++;
            }
            else if(movesArray[i]=='R'){
                LR_Present--;
            }
            else if(movesArray[i]=='U'){
                UD_Present++;
            }
            else{
                UD_Present--;
            }
        }

        return((LR_Present == 0) && (UD_Present == 0));
    }
}