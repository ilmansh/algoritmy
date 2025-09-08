#include <iostream>
#include <vector>
#include <stack>
using namespace std;

int main() {
  // Стек
  stack<string> st;
  st.push("А"); // добавляем(в конец)
  st.push("Б"):
  cout << "Верхушка:" << st.top() << endl;
  st.pop(); // удаляем(верх)
  cout << "Верхушка:" << st.top() << endl;

  // Массив
  vector<int> array = {5, 3, 6, 1};
  cout << "Элемент с индексом 2: " << array[2] << endl;

  array.push_back(11);
  array.erase(array.begin() + 1); // удаляем второй элемент
}
