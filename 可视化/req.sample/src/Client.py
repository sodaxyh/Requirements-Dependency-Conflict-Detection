# -*- coding: UTF-8 -*-
import grpc
import json
from Proto import Requirement_pb2, Requirement_pb2_grpc
import os
from Save_req import Xmi_req

dir_content = "E://Eclipse/runtime-New_configuration(4)/req.sample/"

def write_file(file_name, data):
    with open(file_name, 'w', encoding='UTF-8') as fp:
        fp.write(data)

        
def read_file(file_name):
    with open(file_name, 'r', encoding='UTF-8') as fp:
        data_dict = json.load(fp)
    return data_dict


def struct_req(value, xmi_file):
    # # 调用需求结构化grpc服务
    # print('需求结构化request\n')
    # response = stub.structurization(value)
    # # 将结果写入文件
    # write_file("../test/structReq.txt", response.value)
    # print(response.value)
    # dic_test = json.loads(response.value)
    # print(dic_test['items'])
    print("hhhhhhhhhh"+dir_content)
    req_dic = read_file(os.path.join(dir_content, "test/structReq.txt"))
    xmi_file.reqs_xmi(req_dic)


def relate_req(value, xmi_file):
    # # 调用关联关系检测grpc服务
    # print('需求关联关系检测request\n')
    # response = stub.relationship(value)
    # # 将结果写入文件
    # write_file("../test/relateReq.txt", response.value)
    # print(response.value)
    normal_dic = read_file(os.path.join(dir_content, "test/relateReq.txt"))
    xmi_file.assocs_xmi(normal_dic)


def conflict_req(value):
    # 调用冲突检测grpc服务
    print('需求冲突检测request\n')
    response = stub.conflictdetect(value)
    # 将结果写入文件
    write_file(os.path.join(dir_content, "test/conflictReq.txt"), response.value)
    # print(response.value)



    

