# math
Vmware math
Does two operations add and diff

add:
POST http://{ip}/api/add
payload:
{
	"x":"100",
	"y":"50"
}
response:
{
    "result": "150"
}

diff:
POST http://{ip}/api/diff
payload:
{
	"x":"100",
	"y":"50"
}
response:
{
    "result": "50"
}
