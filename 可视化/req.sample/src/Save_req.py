# -*- coding: UTF-8 -*-


class Xmi_req:
    
    def __init__(self, name):
        # 文件名称
        self.name = name
        # 文件指针
        fp = open("E://Eclipse/runtime-New_configuration(4)/req.sample/" + name + ".req", 'w', encoding='UTF-8')
        self.fp = fp
        # 文件内容
        self.content = {}
        str_start = '''<?xml version="1.0" encoding="UTF-8"?>
<req:SRS xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:req="http://www.example.org/req" ID="00" Name="''' + name + "\">\n"
        str_end = '''</req:SRS>'''
        self.content['start'] = str_start
        self.content['end'] = str_end
        self.content['func'] = []
        self.content['nonFunc'] = []
        self.content['inf'] = []
        self.content['normal'] = []
        self.content['abnormal'] = []
        print(self.content)
    
    # 需求/关系标签开头
    def __beginning(self, type):
        if type == 'reqs':
            tmp = "  <reqs "
        else:
            tmp = "  <assocs "
        return tmp + "xsi:type=\"req:"
    
    def __tmp_tuple(self, param, dic):
        return param.capitalize() + "=\"" + dic[param] + "\" "
    
    # 功能需求    
    def __func_req(self, func_dic):
        beginning = self.__beginning('reqs') + "Functional_req\" "
        id = "ID=\"" + func_dic["id"] + "\" "
        description = self.__tmp_tuple("description", func_dic)
        event = self.__tmp_tuple("event", func_dic)
        agent = self.__tmp_tuple("agent", func_dic)
        operation = self.__tmp_tuple("operation", func_dic)
        input = self.__tmp_tuple("input", func_dic)
        output = self.__tmp_tuple("output", func_dic)
        restriction = self.__tmp_tuple("restriction", func_dic)
        func_tuple = beginning + id + description + event + agent + operation + input + output + restriction + "/>\n"
        self.content['func'].append(func_tuple)
    
    # 性能需求    
    def __pf_req(self, pf_dic):
        beginning = self.__beginning('reqs') + "Performance\" "
        id = "ID=\"" + pf_dic["id"] + "\" "
        description = self.__tmp_tuple("description", pf_dic)
        vtype = self.__tmp_tuple("vtype", pf_dic)
        rtype = self.__tmp_tuple("rtype", pf_dic)
        sign = self.__tmp_tuple("sign", pf_dic)
        value = self.__tmp_tuple("value", pf_dic)
        pf_tuple = beginning + id + description + vtype + rtype + sign + value + "/>\n"
        self.content['nonFunc'].append(pf_tuple)
    
    # 可靠性需求
    def __relia_req(self, relia_dic):
        beginning = self.__beginning('reqs') + "Reliability\" "
        id = "ID=\"" + relia_dic["id"] + "\" "
        description = self.__tmp_tuple(description, relia_dic)
        vtype = self.__tmp_tuple("vtype", relia_dic)
        sign1 = self.__tmp_tuple("sign1", relia_dic)
        sign2 = self.__tmp_tuple("sign2", relia_dic)
        duration = self.__tmp_tuple("duration", relia_dic)
        pr = self.__tmp_tuple("pr", relia_dic)
        relia_tuple = beginning + id + description + vtype + sign1 + sign2 + duration + pr + "/>\n"
        self.content['nonFunc'].append(relia_tuple)
    
    def reqs_xmi(self, req_dic):
        for reqs in req_dic["items"]:
            reqs_re = reqs["result"][0]
            type = reqs_re["type"]
            if type == "2":
                self.__func_req(reqs_re)
            elif type == "3":
                self.__pf_req(reqs_re)
            elif type == "4":
                self.__relia_req(reqs_re)
    
    def __assocs(self, ass_dic):
        beginning = self.__beginning('assocs')
        if ass_dic["relationType"] == "0":
            rel_type = "Depend\" "
        elif ass_dic["relationType"] == "2":
            rel_type = "Composite\" "
        elif ass_dic["relationType"] == "4":
            rel_type = "Interact\" "
        elif ass_dic["relationType"] == "5":
            rel_type = "Constrain\" "
        elif ass_dic["relationType"] == "7":
            rel_type = "Realize\" "
        return beginning + rel_type
            
    def assocs_xmi(self, normal_dic):
        for assocs in normal_dic["result"]:
            normal_tuple = self.__assocs(assocs) + "source=\"//@reqs." + assocs["id1"] + "\" target=\"//@reqs." + assocs["id2"] + "\"/>\n"
            self.content['normal'].append(normal_tuple)
    
    def write_file(self):
        self.fp.write(self.content['start'])
        self.fp.writelines(self.content['func'])
        self.fp.writelines(self.content['nonFunc'])
        self.fp.writelines(self.content['normal'])
        self.fp.write(self.content['end'])
        self.fp.close()
        
