# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetInstanceBackupsResult',
    'AwaitableGetInstanceBackupsResult',
    'get_instance_backups',
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
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
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
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="inProgresses")
    def in_progresses(self) -> Sequence['outputs.GetInstanceBackupsInProgressResult']:
        return pulumi.get(self, "in_progresses")

    @property
    @pulumi.getter(name="linodeId")
    def linode_id(self) -> int:
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


def get_instance_backups(linode_id: Optional[int] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetInstanceBackupsResult:
    """
    Provides details about the backups of an Instance.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_linode as linode

    my_backups = linode.get_instance_backups(id=123)
    ```


    :param int linode_id: The Linode instance's ID.
    """
    __args__ = dict()
    __args__['linodeId'] = linode_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('linode:index/getInstanceBackups:getInstanceBackups', __args__, opts=opts, typ=GetInstanceBackupsResult).value

    return AwaitableGetInstanceBackupsResult(
        automatics=__ret__.automatics,
        currents=__ret__.currents,
        id=__ret__.id,
        in_progresses=__ret__.in_progresses,
        linode_id=__ret__.linode_id)
