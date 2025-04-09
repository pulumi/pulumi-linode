# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import builtins
import copy
import warnings
import sys
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
if sys.version_info >= (3, 11):
    from typing import NotRequired, TypedDict, TypeAlias
else:
    from typing_extensions import NotRequired, TypedDict, TypeAlias
from . import _utilities
from . import outputs

__all__ = [
    'GetInstanceBackupsResult',
    'AwaitableGetInstanceBackupsResult',
    'get_instance_backups',
    'get_instance_backups_output',
]

@pulumi.output_type
class GetInstanceBackupsResult:
    """
    A collection of values returned by getInstanceBackups.
    """
    def __init__(__self__, automatics=None, currents=None, id=None, in_progresses=None, linode_id=None):
        if automatics and not isinstance(automatics, list):
            raise TypeError("Expected argument 'automatics' to be a list")
        pulumi.set(__self__, "automatics", automatics)
        if currents and not isinstance(currents, list):
            raise TypeError("Expected argument 'currents' to be a list")
        pulumi.set(__self__, "currents", currents)
        if id and not isinstance(id, int):
            raise TypeError("Expected argument 'id' to be a int")
        pulumi.set(__self__, "id", id)
        if in_progresses and not isinstance(in_progresses, list):
            raise TypeError("Expected argument 'in_progresses' to be a list")
        pulumi.set(__self__, "in_progresses", in_progresses)
        if linode_id and not isinstance(linode_id, int):
            raise TypeError("Expected argument 'linode_id' to be a int")
        pulumi.set(__self__, "linode_id", linode_id)

    @property
    @pulumi.getter
    def automatics(self) -> Sequence['outputs.GetInstanceBackupsAutomaticResult']:
        return pulumi.get(self, "automatics")

    @property
    @pulumi.getter
    def currents(self) -> Sequence['outputs.GetInstanceBackupsCurrentResult']:
        return pulumi.get(self, "currents")

    @property
    @pulumi.getter
    def id(self) -> builtins.int:
        """
        The unique ID of this Backup.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inProgresses")
    def in_progresses(self) -> Sequence['outputs.GetInstanceBackupsInProgressResult']:
        return pulumi.get(self, "in_progresses")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> builtins.int:
        return pulumi.get(self, "linode_id")


class AwaitableGetInstanceBackupsResult(GetInstanceBackupsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetInstanceBackupsResult(
            automatics=self.automatics,
            currents=self.currents,
            id=self.id,
            in_progresses=self.in_progresses,
            linode_id=self.linode_id)


def get_instance_backups(linode_id: Optional[builtins.int] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceBackupsResult:
    """
    Provides details about the backups of an Instance.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-backups).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_backups = linode.get_instance_backups(linode_id=123)
    ```


    :param builtins.int linode_id: The Linode instance's ID.
    """
    __args__ = dict()
    __args__['linodeId'] = linode_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceBackups:getInstanceBackups', __args__, opts=opts, typ=GetInstanceBackupsResult).value

    return AwaitableGetInstanceBackupsResult(
        automatics=pulumi.get(__ret__, 'automatics'),
        currents=pulumi.get(__ret__, 'currents'),
        id=pulumi.get(__ret__, 'id'),
        in_progresses=pulumi.get(__ret__, 'in_progresses'),
        linode_id=pulumi.get(__ret__, 'linode_id'))
def get_instance_backups_output(linode_id: Optional[pulumi.Input[builtins.int]] = None,
                                opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetInstanceBackupsResult]:
    """
    Provides details about the backups of an Instance.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-backups).

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_backups = linode.get_instance_backups(linode_id=123)
    ```


    :param builtins.int linode_id: The Linode instance's ID.
    """
    __args__ = dict()
    __args__['linodeId'] = linode_id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getInstanceBackups:getInstanceBackups', __args__, opts=opts, typ=GetInstanceBackupsResult)
    return __ret__.apply(lambda __response__: GetInstanceBackupsResult(
        automatics=pulumi.get(__response__, 'automatics'),
        currents=pulumi.get(__response__, 'currents'),
        id=pulumi.get(__response__, 'id'),
        in_progresses=pulumi.get(__response__, 'in_progresses'),
        linode_id=pulumi.get(__response__, 'linode_id')))
