namespace java com.thrift

include "TriftDataType.thrift"

service TSimpleServerService{
	TriftDataType.ResultStr sayHello(1:string username)
}