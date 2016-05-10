
"""
text = input()
people, match = text.split()
print(int(match) ** int(people))
"""
"""
푸는 원리는 사람수는 중복값 가능하게 종류 를 가질 수 있다
사람 1명 = match(경우의수)
사람 2명 = match(경우의수) * match(경우의수)
총 사람  = match 사람
"""
"""
people, match = eval(input())
print(match ** people)
"""
"""
number = eval(input())

print("{0} {1:.2f}".format(int(number // 1), round(number % 1, 2)))
"""
"""
rows, cols = eval(input())
row = rows // 8
col = cols // 8
other_row = rows % 8
other_col = cols % 8
if other_row != 0:
	other_row = 1
if other_col != 0:
	other_col = 1

print("The number of whole tiles is", row *col, "part tiles is", (other_row * col) + (other_col * row) + (other_col * other_row))
"""
"""
one, two, three, four = eval(input())
burger = [461, 431, 420, 0]
beverage = [130, 160, 118, 0]
sider_order = [100, 57, 70, 0]
dissert = [167, 266, 75, 0]

print(("Your total Calorie count is", burger[one - 1] + beverage[two - 1] + sider_order[three - 1] + dissert[four - 1]))
"""

number1, number2 = eval(input())
even_odd_list = ["even", "odd"]
number1 = number1 % 2
number2 = number2 % 2

print(even_odd_list[number1] +  "+" + even_odd_list[number2] + "=" + even_odd_list[(number1 + number2) % 2])
print(even_odd_list[number1] +  "*" + even_odd_list[number2] + "=" + even_odd_list[(number1 * number2)])