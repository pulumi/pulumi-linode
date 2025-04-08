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
    'GetDatabasePostgresqlV2Result',
    'AwaitableGetDatabasePostgresqlV2Result',
    'get_database_postgresql_v2',
    'get_database_postgresql_v2_output',
]

@pulumi.output_type
class GetDatabasePostgresqlV2Result:
    """
    A collection of values returned by getDatabasePostgresqlV2.
    """
    def __init__(__self__, allow_lists=None, ca_cert=None, cluster_size=None, created=None, encrypted=None, engine=None, engine_id=None, fork_restore_time=None, fork_source=None, host_primary=None, host_secondary=None, id=None, label=None, members=None, oldest_restore_time=None, pending_updates=None, platform=None, port=None, region=None, root_password=None, root_username=None, ssl_connection=None, status=None, suspended=None, type=None, updated=None, updates=None, version=None):
        if allow_lists and not isinstance(allow_lists, list):
            raise TypeError("Expected argument 'allow_lists' to be a list")
        pulumi.set(__self__, "allow_lists", allow_lists)
        if ca_cert and not isinstance(ca_cert, str):
            raise TypeError("Expected argument 'ca_cert' to be a str")
        pulumi.set(__self__, "ca_cert", ca_cert)
        if cluster_size and not isinstance(cluster_size, int):
            raise TypeError("Expected argument 'cluster_size' to be a int")
        pulumi.set(__self__, "cluster_size", cluster_size)
        if created and not isinstance(created, str):
            raise TypeError("Expected argument 'created' to be a str")
        pulumi.set(__self__, "created", created)
        if encrypted and not isinstance(encrypted, bool):
            raise TypeError("Expected argument 'encrypted' to be a bool")
        pulumi.set(__self__, "encrypted", encrypted)
        if engine and not isinstance(engine, str):
            raise TypeError("Expected argument 'engine' to be a str")
        pulumi.set(__self__, "engine", engine)
        if engine_id and not isinstance(engine_id, str):
            raise TypeError("Expected argument 'engine_id' to be a str")
        pulumi.set(__self__, "engine_id", engine_id)
        if fork_restore_time and not isinstance(fork_restore_time, str):
            raise TypeError("Expected argument 'fork_restore_time' to be a str")
        pulumi.set(__self__, "fork_restore_time", fork_restore_time)
        if fork_source and not isinstance(fork_source, int):
            raise TypeError("Expected argument 'fork_source' to be a int")
        pulumi.set(__self__, "fork_source", fork_source)
        if host_primary and not isinstance(host_primary, str):
            raise TypeError("Expected argument 'host_primary' to be a str")
        pulumi.set(__self__, "host_primary", host_primary)
        if host_secondary and not isinstance(host_secondary, str):
            raise TypeError("Expected argument 'host_secondary' to be a str")
        pulumi.set(__self__, "host_secondary", host_secondary)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if label and not isinstance(label, str):
            raise TypeError("Expected argument 'label' to be a str")
        pulumi.set(__self__, "label", label)
        if members and not isinstance(members, dict):
            raise TypeError("Expected argument 'members' to be a dict")
        pulumi.set(__self__, "members", members)
        if oldest_restore_time and not isinstance(oldest_restore_time, str):
            raise TypeError("Expected argument 'oldest_restore_time' to be a str")
        pulumi.set(__self__, "oldest_restore_time", oldest_restore_time)
        if pending_updates and not isinstance(pending_updates, list):
            raise TypeError("Expected argument 'pending_updates' to be a list")
        pulumi.set(__self__, "pending_updates", pending_updates)
        if platform and not isinstance(platform, str):
            raise TypeError("Expected argument 'platform' to be a str")
        pulumi.set(__self__, "platform", platform)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if region and not isinstance(region, str):
            raise TypeError("Expected argument 'region' to be a str")
        pulumi.set(__self__, "region", region)
        if root_password and not isinstance(root_password, str):
            raise TypeError("Expected argument 'root_password' to be a str")
        pulumi.set(__self__, "root_password", root_password)
        if root_username and not isinstance(root_username, str):
            raise TypeError("Expected argument 'root_username' to be a str")
        pulumi.set(__self__, "root_username", root_username)
        if ssl_connection and not isinstance(ssl_connection, bool):
            raise TypeError("Expected argument 'ssl_connection' to be a bool")
        pulumi.set(__self__, "ssl_connection", ssl_connection)
        if status and not isinstance(status, str):
            raise TypeError("Expected argument 'status' to be a str")
        pulumi.set(__self__, "status", status)
        if suspended and not isinstance(suspended, bool):
            raise TypeError("Expected argument 'suspended' to be a bool")
        pulumi.set(__self__, "suspended", suspended)
        if type and not isinstance(type, str):
            raise TypeError("Expected argument 'type' to be a str")
        pulumi.set(__self__, "type", type)
        if updated and not isinstance(updated, str):
            raise TypeError("Expected argument 'updated' to be a str")
        pulumi.set(__self__, "updated", updated)
        if updates and not isinstance(updates, dict):
            raise TypeError("Expected argument 'updates' to be a dict")
        pulumi.set(__self__, "updates", updates)
        if version and not isinstance(version, str):
            raise TypeError("Expected argument 'version' to be a str")
        pulumi.set(__self__, "version", version)

    @property
    @pulumi.getter(name="allowLists")
    def allow_lists(self) -> Sequence[builtins.str]:
        """
        A list of IP addresses that can access the Managed Database. Each item can be a single IP address or a range in CIDR format. Use `DatabaseAccessControls` to manage your allow list separately.
        """
        return pulumi.get(self, "allow_lists")

    @property
    @pulumi.getter(name="caCert")
    def ca_cert(self) -> builtins.str:
        """
        The base64-encoded SSL CA certificate for the Managed Database.
        """
        return pulumi.get(self, "ca_cert")

    @property
    @pulumi.getter(name="clusterSize")
    def cluster_size(self) -> builtins.int:
        """
        The number of Linode Instance nodes deployed to the Managed Database. (default `1`)
        """
        return pulumi.get(self, "cluster_size")

    @property
    @pulumi.getter
    def created(self) -> builtins.str:
        """
        When this Managed Database was created.
        """
        return pulumi.get(self, "created")

    @property
    @pulumi.getter
    def encrypted(self) -> builtins.bool:
        """
        Whether the Managed Databases is encrypted.
        """
        return pulumi.get(self, "encrypted")

    @property
    @pulumi.getter
    def engine(self) -> builtins.str:
        """
        The Managed Database engine. (e.g. `postgresql`)
        """
        return pulumi.get(self, "engine")

    @property
    @pulumi.getter(name="engineId")
    def engine_id(self) -> builtins.str:
        """
        The Managed Database engine in engine/version format. (e.g. `postgresql/16`)
        """
        return pulumi.get(self, "engine_id")

    @property
    @pulumi.getter(name="forkRestoreTime")
    def fork_restore_time(self) -> builtins.str:
        """
        The database timestamp from which it was restored.
        """
        return pulumi.get(self, "fork_restore_time")

    @property
    @pulumi.getter(name="forkSource")
    def fork_source(self) -> builtins.int:
        """
        The ID of the database that was forked from.
        """
        return pulumi.get(self, "fork_source")

    @property
    @pulumi.getter(name="hostPrimary")
    def host_primary(self) -> builtins.str:
        """
        The primary host for the Managed Database.
        """
        return pulumi.get(self, "host_primary")

    @property
    @pulumi.getter(name="hostSecondary")
    def host_secondary(self) -> builtins.str:
        """
        The secondary/private host for the managed database.
        """
        return pulumi.get(self, "host_secondary")

    @property
    @pulumi.getter
    def id(self) -> builtins.str:
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def label(self) -> builtins.str:
        """
        A unique, user-defined string referring to the Managed Database.
        """
        return pulumi.get(self, "label")

    @property
    @pulumi.getter
    def members(self) -> Mapping[str, builtins.str]:
        return pulumi.get(self, "members")

    @property
    @pulumi.getter(name="oldestRestoreTime")
    def oldest_restore_time(self) -> builtins.str:
        return pulumi.get(self, "oldest_restore_time")

    @property
    @pulumi.getter(name="pendingUpdates")
    def pending_updates(self) -> Sequence['outputs.GetDatabasePostgresqlV2PendingUpdateResult']:
        return pulumi.get(self, "pending_updates")

    @property
    @pulumi.getter
    def platform(self) -> builtins.str:
        """
        The back-end platform for relational databases used by the service.
        """
        return pulumi.get(self, "platform")

    @property
    @pulumi.getter
    def port(self) -> builtins.int:
        """
        The access port for this Managed Database.
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter
    def region(self) -> builtins.str:
        """
        The region to use for the Managed Database.
        """
        return pulumi.get(self, "region")

    @property
    @pulumi.getter(name="rootPassword")
    def root_password(self) -> builtins.str:
        """
        The randomly-generated root password for the Managed Database instance.
        """
        return pulumi.get(self, "root_password")

    @property
    @pulumi.getter(name="rootUsername")
    def root_username(self) -> builtins.str:
        """
        The root username for the Managed Database instance.
        """
        return pulumi.get(self, "root_username")

    @property
    @pulumi.getter(name="sslConnection")
    def ssl_connection(self) -> builtins.bool:
        """
        Whether to require SSL credentials to establish a connection to the Managed Database.
        """
        return pulumi.get(self, "ssl_connection")

    @property
    @pulumi.getter
    def status(self) -> builtins.str:
        """
        The operating status of the Managed Database.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def suspended(self) -> builtins.bool:
        """
        Whether this Managed Database is suspended.
        """
        return pulumi.get(self, "suspended")

    @property
    @pulumi.getter
    def type(self) -> builtins.str:
        """
        The Linode Instance type used for the nodes of the Managed Database.
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def updated(self) -> builtins.str:
        """
        When this Managed Database was last updated.
        """
        return pulumi.get(self, "updated")

    @property
    @pulumi.getter
    def updates(self) -> 'outputs.GetDatabasePostgresqlV2UpdatesResult':
        return pulumi.get(self, "updates")

    @property
    @pulumi.getter
    def version(self) -> builtins.str:
        """
        The Managed Database engine version. (e.g. `13.2`)
        """
        return pulumi.get(self, "version")


class AwaitableGetDatabasePostgresqlV2Result(GetDatabasePostgresqlV2Result):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatabasePostgresqlV2Result(
            allow_lists=self.allow_lists,
            ca_cert=self.ca_cert,
            cluster_size=self.cluster_size,
            created=self.created,
            encrypted=self.encrypted,
            engine=self.engine,
            engine_id=self.engine_id,
            fork_restore_time=self.fork_restore_time,
            fork_source=self.fork_source,
            host_primary=self.host_primary,
            host_secondary=self.host_secondary,
            id=self.id,
            label=self.label,
            members=self.members,
            oldest_restore_time=self.oldest_restore_time,
            pending_updates=self.pending_updates,
            platform=self.platform,
            port=self.port,
            region=self.region,
            root_password=self.root_password,
            root_username=self.root_username,
            ssl_connection=self.ssl_connection,
            status=self.status,
            suspended=self.suspended,
            type=self.type,
            updated=self.updated,
            updates=self.updates,
            version=self.version)


def get_database_postgresql_v2(id: Optional[builtins.str] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatabasePostgresqlV2Result:
    """
    Provides information about a Linode PostgreSQL Database.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-postgre-sql-instance-backups).

    ## Example Usage

    Get information about a PostgreSQL database:

    ```python
    import pulumi
    import pulumi_linode as linode

    my_db = linode.get_database_postgresql_v2(id="12345")
    ```

    ## pending_updates

    The following arguments are exposed by each entry in the `pending_updates` attribute:

    * `deadline` - The time when a mandatory update needs to be applied.

    * `description` - A description of the update.

    * `planned_for` - The date and time a maintenance update will be applied.

    ## updates

    The following arguments are supported in the `updates` specification block:

    * `day_of_week` - The day to perform maintenance. (`monday`, `tuesday`, ...)

    * `duration` - The maximum maintenance window time in hours. (`1`..`3`)

    * `frequency` - The frequency at which maintenance occurs. (`weekly`)

    * `hour_of_day` - The hour to begin maintenance based in UTC time. (`0`..`23`)


    :param builtins.str id: The ID of the PostgreSQL database.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('linode:index/getDatabasePostgresqlV2:getDatabasePostgresqlV2', __args__, opts=opts, typ=GetDatabasePostgresqlV2Result).value

    return AwaitableGetDatabasePostgresqlV2Result(
        allow_lists=pulumi.get(__ret__, 'allow_lists'),
        ca_cert=pulumi.get(__ret__, 'ca_cert'),
        cluster_size=pulumi.get(__ret__, 'cluster_size'),
        created=pulumi.get(__ret__, 'created'),
        encrypted=pulumi.get(__ret__, 'encrypted'),
        engine=pulumi.get(__ret__, 'engine'),
        engine_id=pulumi.get(__ret__, 'engine_id'),
        fork_restore_time=pulumi.get(__ret__, 'fork_restore_time'),
        fork_source=pulumi.get(__ret__, 'fork_source'),
        host_primary=pulumi.get(__ret__, 'host_primary'),
        host_secondary=pulumi.get(__ret__, 'host_secondary'),
        id=pulumi.get(__ret__, 'id'),
        label=pulumi.get(__ret__, 'label'),
        members=pulumi.get(__ret__, 'members'),
        oldest_restore_time=pulumi.get(__ret__, 'oldest_restore_time'),
        pending_updates=pulumi.get(__ret__, 'pending_updates'),
        platform=pulumi.get(__ret__, 'platform'),
        port=pulumi.get(__ret__, 'port'),
        region=pulumi.get(__ret__, 'region'),
        root_password=pulumi.get(__ret__, 'root_password'),
        root_username=pulumi.get(__ret__, 'root_username'),
        ssl_connection=pulumi.get(__ret__, 'ssl_connection'),
        status=pulumi.get(__ret__, 'status'),
        suspended=pulumi.get(__ret__, 'suspended'),
        type=pulumi.get(__ret__, 'type'),
        updated=pulumi.get(__ret__, 'updated'),
        updates=pulumi.get(__ret__, 'updates'),
        version=pulumi.get(__ret__, 'version'))
def get_database_postgresql_v2_output(id: Optional[pulumi.Input[builtins.str]] = None,
                                      opts: Optional[Union[pulumi.InvokeOptions, pulumi.InvokeOutputOptions]] = None) -> pulumi.Output[GetDatabasePostgresqlV2Result]:
    """
    Provides information about a Linode PostgreSQL Database.
    For more information, see the [Linode APIv4 docs](https://techdocs.akamai.com/linode-api/reference/get-databases-postgre-sql-instance-backups).

    ## Example Usage

    Get information about a PostgreSQL database:

    ```python
    import pulumi
    import pulumi_linode as linode

    my_db = linode.get_database_postgresql_v2(id="12345")
    ```

    ## pending_updates

    The following arguments are exposed by each entry in the `pending_updates` attribute:

    * `deadline` - The time when a mandatory update needs to be applied.

    * `description` - A description of the update.

    * `planned_for` - The date and time a maintenance update will be applied.

    ## updates

    The following arguments are supported in the `updates` specification block:

    * `day_of_week` - The day to perform maintenance. (`monday`, `tuesday`, ...)

    * `duration` - The maximum maintenance window time in hours. (`1`..`3`)

    * `frequency` - The frequency at which maintenance occurs. (`weekly`)

    * `hour_of_day` - The hour to begin maintenance based in UTC time. (`0`..`23`)


    :param builtins.str id: The ID of the PostgreSQL database.
    """
    __args__ = dict()
    __args__['id'] = id
    opts = pulumi.InvokeOutputOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke_output('linode:index/getDatabasePostgresqlV2:getDatabasePostgresqlV2', __args__, opts=opts, typ=GetDatabasePostgresqlV2Result)
    return __ret__.apply(lambda __response__: GetDatabasePostgresqlV2Result(
        allow_lists=pulumi.get(__response__, 'allow_lists'),
        ca_cert=pulumi.get(__response__, 'ca_cert'),
        cluster_size=pulumi.get(__response__, 'cluster_size'),
        created=pulumi.get(__response__, 'created'),
        encrypted=pulumi.get(__response__, 'encrypted'),
        engine=pulumi.get(__response__, 'engine'),
        engine_id=pulumi.get(__response__, 'engine_id'),
        fork_restore_time=pulumi.get(__response__, 'fork_restore_time'),
        fork_source=pulumi.get(__response__, 'fork_source'),
        host_primary=pulumi.get(__response__, 'host_primary'),
        host_secondary=pulumi.get(__response__, 'host_secondary'),
        id=pulumi.get(__response__, 'id'),
        label=pulumi.get(__response__, 'label'),
        members=pulumi.get(__response__, 'members'),
        oldest_restore_time=pulumi.get(__response__, 'oldest_restore_time'),
        pending_updates=pulumi.get(__response__, 'pending_updates'),
        platform=pulumi.get(__response__, 'platform'),
        port=pulumi.get(__response__, 'port'),
        region=pulumi.get(__response__, 'region'),
        root_password=pulumi.get(__response__, 'root_password'),
        root_username=pulumi.get(__response__, 'root_username'),
        ssl_connection=pulumi.get(__response__, 'ssl_connection'),
        status=pulumi.get(__response__, 'status'),
        suspended=pulumi.get(__response__, 'suspended'),
        type=pulumi.get(__response__, 'type'),
        updated=pulumi.get(__response__, 'updated'),
        updates=pulumi.get(__response__, 'updates'),
        version=pulumi.get(__response__, 'version')))
