# Write whatever you want!
# 客户原话：
“我们需要一个应用程序，用来记录我们的待办列表，能够添加、删除待办事项，也能够把待办事项修改为完成。”
# 具体的需求分析：
记录待办事项列表：指能够储存信息(包括事件名称和备注)
添加、删除待办事项：指能够修改列表当中的一个部分或多个部分
把待办事项修改为完成：指能够储存/更改完成状态信息。
# 组成部分：
## 1.结构体。
结构体包含的信息有：
待办事项编号、
待办事项名称、
待办事项描述、
待办事项完成状态。
其中待办事项完成状态默认是“未完成”。
## 2.数据库。
数据库用来储存上述待办事项。
# 函数/方法：
## 1.添加：
构建一个方法，用来添加待办事项。
用户输入添加指令，激活函数。
通过说明让用户输入待办事项名称、描述。
随后在数据库中新建一个结构体。
## 2.删除：
构建一个方法，用来删除待办事项。
用户输入删除指令，激活函数。
通过说明让用户输入需要删除的待办事项的编号。
随后删除数据库中相应编号的结构体。
## 3.修改为完成：
构建一个方法，用来更改完成状态。
用户输入修改状态指令，激活函数。
通过说明让用户输入需要修改状态的待办事项编号。
修改数据库中相应结构体完成状态。
## 4.退出：
构建一个方法，用来退出软件。
用户输入删除指令，结束运行。