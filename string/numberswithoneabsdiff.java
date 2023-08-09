// Numbers with one absolute difference

class Solution{
    ArrayList<Long> absDifOne(long N){
        Queue<Long> q = new LinkedList<>();
        for (int i = 1; i <= 9; i++) {
            q.add((long) i);
        }
        ArrayList<Long> res = new ArrayList<>();
        boolean done = false;
        while (true) {
            int size = q.size();
            while (size-- > 0) {
                long temp = q.poll();
                if (temp > 9 && temp <= N) {
                    res.add(temp);
                }
                if (temp > N) {
                    done = true;
                    break;
                }
                int lastDigit = (int) (temp % 10);
                if (lastDigit == 0) {
                    long neighbourA = temp * 10 + lastDigit + 1;
                    q.add(neighbourA);
                } else if (lastDigit == 9) {
                    long neighbourB = temp * 10 + lastDigit - 1;
                    q.add(neighbourB);
                } else {
                    long neighbourA = temp * 10 + lastDigit + 1;
                    long neighbourB = temp * 10 + lastDigit - 1;
                    q.add(neighbourB);
                    q.add(neighbourA);
                }
            }
            if (done) {
                break;
            }
        }
        return res;
    }
}
