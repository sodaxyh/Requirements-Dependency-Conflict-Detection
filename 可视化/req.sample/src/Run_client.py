# -*- coding: UTF-8 -*-
import Client
if __name__ == "__main__":
    # # 打开 gRPC channel，连接到 localhost:50051
    # channel = grpc.insecure_channel('localhost:50051')
    #
    # # 创建一个 stub (gRPC client)
    # stub = Requirement_pb2_grpc.RequirementStub(channel)
    #
    # # 创建一个有效的请求消息 value
    # data_dict = read_file("../test/testData.txt")
    # data = json.dumps(data_dict, ensure_ascii=False)
    # value = Requirement_pb2.Value(value=data)
    value = ""
    xmi1 = Client.Xmi_req("My")
    Client.struct_req(value, xmi1)
    Client.relate_req(value, xmi1)
    # conflict_req(value)
    
    xmi1.write_file()