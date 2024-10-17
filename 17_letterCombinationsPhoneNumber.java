class Solution {
    public List<String> letterCombinations(String digits) {
        String[] letters = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new LinkedList<>();
        if(digits == null || digits.length() == 0) return res;
        dfs(digits, 0, res, letters, new StringBuilder());
        return res;
    }
    private void dfs(String digits, int index, List<String> result, String[] letters, StringBuilder sb){
        if(index >= digits.length()){
            result.add(sb.toString());
            return;
        }
        int i = digits.charAt(index) - '0';
        for(int j = 0; j < letters[i].length(); j++){
            sb.append(letters[i].charAt(j));
            dfs(digits, index + 1, result, letters, sb);
            sb.deleteCharAt(index);
        }
    }
}
