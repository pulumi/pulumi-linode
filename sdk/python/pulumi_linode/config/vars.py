# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('linode')


class _ExportableConfig(types.ModuleType):
    @property
    def api_version(self) -> Optional[str]:
        """
        The version of Linode API.
        """
        return __config__.get('apiVersion') or _utilities.get_env('LINODE_API_VERSION')

    @property
    def config_path(self) -> Optional[str]:
        return __config__.get('configPath')

    @property
    def config_profile(self) -> Optional[str]:
        return __config__.get('configProfile')

    @property
    def disable_internal_cache(self) -> Optional[bool]:
        """
        Disable the internal caching system that backs certain Linode API requests.
        """
        return __config__.get_bool('disableInternalCache')

    @property
    def event_poll_ms(self) -> Optional[int]:
        """
        The rate in milliseconds to poll for events.
        """
        return __config__.get_int('eventPollMs')

    @property
    def lke_event_poll_ms(self) -> Optional[int]:
        """
        The rate in milliseconds to poll for LKE events.
        """
        return __config__.get_int('lkeEventPollMs')

    @property
    def lke_node_ready_poll_ms(self) -> Optional[int]:
        """
        The rate in milliseconds to poll for an LKE node to be ready.
        """
        return __config__.get_int('lkeNodeReadyPollMs')

    @property
    def max_retry_delay_ms(self) -> Optional[int]:
        """
        Maximum delay in milliseconds before retrying a request.
        """
        return __config__.get_int('maxRetryDelayMs')

    @property
    def min_retry_delay_ms(self) -> Optional[int]:
        """
        Minimum delay in milliseconds before retrying a request.
        """
        return __config__.get_int('minRetryDelayMs')

    @property
    def skip_implicit_reboots(self) -> Optional[bool]:
        """
        If true, Linode Instances will not be rebooted on config and interface changes.
        """
        return __config__.get_bool('skipImplicitReboots')

    @property
    def skip_instance_delete_poll(self) -> Optional[bool]:
        """
        Skip waiting for a Instance resource to finish deleting.
        """
        return __config__.get_bool('skipInstanceDeletePoll')

    @property
    def skip_instance_ready_poll(self) -> Optional[bool]:
        """
        Skip waiting for a Instance resource to be running.
        """
        return __config__.get_bool('skipInstanceReadyPoll')

    @property
    def token(self) -> Optional[str]:
        """
        The token that allows you access to your Linode account
        """
        return __config__.get('token')

    @property
    def ua_prefix(self) -> Optional[str]:
        """
        An HTTP User-Agent Prefix to prepend in API requests.
        """
        return __config__.get('uaPrefix') or _utilities.get_env('LINODE_UA_PREFIX')

    @property
    def url(self) -> Optional[str]:
        """
        The HTTP(S) API address of the Linode API to use.
        """
        return __config__.get('url') or _utilities.get_env('LINODE_URL')

