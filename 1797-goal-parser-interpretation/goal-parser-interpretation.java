class Solution {
    public String interpret(String command) {
         command = command.replaceAll("\\(\\)", "o");
        command = command.replaceAll("\\(al\\)", "al");
        return command;
    }
}