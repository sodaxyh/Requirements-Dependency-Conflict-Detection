# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
import grpc

from Proto import Requirement_pb2 as Requirement__pb2


class RequirementStub(object):
  # missing associated documentation comment in .proto file
  pass

  def __init__(self, channel):
    """Constructor.

    Args:
      channel: A grpc.Channel.
    """
    self.Itemized = channel.unary_unary(
        '/Requirement/Itemized',
        request_serializer=Requirement__pb2.twoValues.SerializeToString,
        response_deserializer=Requirement__pb2.twoValues.FromString,
        )
    self.Relate_Re_Sugg = channel.unary_unary(
        '/Requirement/Relate_Re_Sugg',
        request_serializer=Requirement__pb2.threeValues.SerializeToString,
        response_deserializer=Requirement__pb2.threeValues.FromString,
        )
    self.rechangeimpact = channel.unary_unary(
        '/Requirement/rechangeimpact',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.structurization = channel.unary_unary(
        '/Requirement/structurization',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.conflictdetect = channel.unary_unary(
        '/Requirement/conflictdetect',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.relationship = channel.unary_unary(
        '/Requirement/relationship',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.checksplit = channel.unary_unary(
        '/Requirement/checksplit',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.classifySecurity = channel.unary_unary(
        '/Requirement/classifySecurity',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.Relate_FR_NFR = channel.unary_unary(
        '/Requirement/Relate_FR_NFR',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.originTrace = channel.unary_unary(
        '/Requirement/originTrace',
        request_serializer=Requirement__pb2.threeValues.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.mTrace = channel.unary_unary(
        '/Requirement/mTrace',
        request_serializer=Requirement__pb2.threeValues.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.taskcost = channel.unary_unary(
        '/Requirement/taskcost',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )
    self.gen_anal = channel.unary_unary(
        '/Requirement/gen_anal',
        request_serializer=Requirement__pb2.Value.SerializeToString,
        response_deserializer=Requirement__pb2.Value.FromString,
        )


class RequirementServicer(object):
  # missing associated documentation comment in .proto file
  pass

  def Itemized(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Relate_Re_Sugg(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def rechangeimpact(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def structurization(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def conflictdetect(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def relationship(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def checksplit(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def classifySecurity(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def Relate_FR_NFR(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def originTrace(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def mTrace(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def taskcost(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')

  def gen_anal(self, request, context):
    # missing associated documentation comment in .proto file
    pass
    context.set_code(grpc.StatusCode.UNIMPLEMENTED)
    context.set_details('Method not implemented!')
    raise NotImplementedError('Method not implemented!')


def add_RequirementServicer_to_server(servicer, server):
  rpc_method_handlers = {
      'Itemized': grpc.unary_unary_rpc_method_handler(
          servicer.Itemized,
          request_deserializer=Requirement__pb2.twoValues.FromString,
          response_serializer=Requirement__pb2.twoValues.SerializeToString,
      ),
      'Relate_Re_Sugg': grpc.unary_unary_rpc_method_handler(
          servicer.Relate_Re_Sugg,
          request_deserializer=Requirement__pb2.threeValues.FromString,
          response_serializer=Requirement__pb2.threeValues.SerializeToString,
      ),
      'rechangeimpact': grpc.unary_unary_rpc_method_handler(
          servicer.rechangeimpact,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'structurization': grpc.unary_unary_rpc_method_handler(
          servicer.structurization,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'conflictdetect': grpc.unary_unary_rpc_method_handler(
          servicer.conflictdetect,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'relationship': grpc.unary_unary_rpc_method_handler(
          servicer.relationship,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'checksplit': grpc.unary_unary_rpc_method_handler(
          servicer.checksplit,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'classifySecurity': grpc.unary_unary_rpc_method_handler(
          servicer.classifySecurity,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'Relate_FR_NFR': grpc.unary_unary_rpc_method_handler(
          servicer.Relate_FR_NFR,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'originTrace': grpc.unary_unary_rpc_method_handler(
          servicer.originTrace,
          request_deserializer=Requirement__pb2.threeValues.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'mTrace': grpc.unary_unary_rpc_method_handler(
          servicer.mTrace,
          request_deserializer=Requirement__pb2.threeValues.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'taskcost': grpc.unary_unary_rpc_method_handler(
          servicer.taskcost,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
      'gen_anal': grpc.unary_unary_rpc_method_handler(
          servicer.gen_anal,
          request_deserializer=Requirement__pb2.Value.FromString,
          response_serializer=Requirement__pb2.Value.SerializeToString,
      ),
  }
  generic_handler = grpc.method_handlers_generic_handler(
      'Requirement', rpc_method_handlers)
  server.add_generic_rpc_handlers((generic_handler,))
