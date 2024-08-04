//import java.util.*;
//
//class Stack {
//
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//
//    while (sc.hasNext()) {
//      String input = sc.next();
//      System.out.println(isBalanced(input) ? "true" : "false");
//    }
//
//    sc.close();
//  }
//
//  static boolean isBalanced(String str) {
//    Stack<Character> stack = new Stack<>();
//
//    for (char c : str.toCharArray()) {
//      switch (c) {
//        case '(':
//        case '{':
//        case '[':
//          stack.push(c); // Push opening brackets
//          break;
//        case ')':
//          if (stack.isEmpty() || stack.pop() != '(') {
//            return false; // Unbalanced closing parenthesis
//          }
//          break;
//        case '}':
//          if (stack.isEmpty() || stack.pop() != '{') {
//            return false; // Unbalanced closing curly brace
//          }
//          break;
//        case ']':
//          if (stack.isEmpty() || stack.pop() != '[') {
//            return false; // Unbalanced closing square bracket
//          }
//          break;
//      }
//    }
//
//    // Unbalanced if any opening brackets remain in the stack
//    return stack.isEmpty();
//  }
//}
