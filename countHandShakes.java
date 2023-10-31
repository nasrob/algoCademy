class Solution {
    /*
        There are n friends in a group. When they meet, everybody shakes hands with everybody.
        How many hand shakes happen?
        A, B, C, D
        (A, B) (A, C) (A, D)
        (B, C) (B, D)
        (C, D)
        A A A O
        B B O O } => rectangle of width = n, height = n - 1, half filled
        C O O O
    */
    public int countHandShakes(int n) {
        return n * (n - 1) / 2;
    }
}