// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.Linode
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("linode");

        private static readonly __Value<string?> _apiVersion = new __Value<string?>(() => __config.Get("apiVersion") ?? Utilities.GetEnv("LINODE_API_VERSION"));
        /// <summary>
        /// An HTTP User-Agent Prefix to prepend in API requests.
        /// </summary>
        public static string? ApiVersion
        {
            get => _apiVersion.Get();
            set => _apiVersion.Set(value);
        }

        private static readonly __Value<string?> _configPath = new __Value<string?>(() => __config.Get("configPath"));
        public static string? ConfigPath
        {
            get => _configPath.Get();
            set => _configPath.Set(value);
        }

        private static readonly __Value<string?> _configProfile = new __Value<string?>(() => __config.Get("configProfile"));
        public static string? ConfigProfile
        {
            get => _configProfile.Get();
            set => _configProfile.Set(value);
        }

        private static readonly __Value<bool?> _disableInternalCache = new __Value<bool?>(() => __config.GetBoolean("disableInternalCache"));
        /// <summary>
        /// Disable the internal caching system that backs certain Linode API requests.
        /// </summary>
        public static bool? DisableInternalCache
        {
            get => _disableInternalCache.Get();
            set => _disableInternalCache.Set(value);
        }

        private static readonly __Value<int?> _eventPollMs = new __Value<int?>(() => __config.GetInt32("eventPollMs"));
        /// <summary>
        /// The rate in milliseconds to poll for events.
        /// </summary>
        public static int? EventPollMs
        {
            get => _eventPollMs.Get();
            set => _eventPollMs.Set(value);
        }

        private static readonly __Value<int?> _lkeEventPollMs = new __Value<int?>(() => __config.GetInt32("lkeEventPollMs"));
        /// <summary>
        /// The rate in milliseconds to poll for LKE events.
        /// </summary>
        public static int? LkeEventPollMs
        {
            get => _lkeEventPollMs.Get();
            set => _lkeEventPollMs.Set(value);
        }

        private static readonly __Value<int?> _lkeNodeReadyPollMs = new __Value<int?>(() => __config.GetInt32("lkeNodeReadyPollMs"));
        /// <summary>
        /// The rate in milliseconds to poll for an LKE node to be ready.
        /// </summary>
        public static int? LkeNodeReadyPollMs
        {
            get => _lkeNodeReadyPollMs.Get();
            set => _lkeNodeReadyPollMs.Set(value);
        }

        private static readonly __Value<int?> _maxRetryDelayMs = new __Value<int?>(() => __config.GetInt32("maxRetryDelayMs"));
        /// <summary>
        /// Maximum delay in milliseconds before retrying a request.
        /// </summary>
        public static int? MaxRetryDelayMs
        {
            get => _maxRetryDelayMs.Get();
            set => _maxRetryDelayMs.Set(value);
        }

        private static readonly __Value<int?> _minRetryDelayMs = new __Value<int?>(() => __config.GetInt32("minRetryDelayMs"));
        /// <summary>
        /// Minimum delay in milliseconds before retrying a request.
        /// </summary>
        public static int? MinRetryDelayMs
        {
            get => _minRetryDelayMs.Get();
            set => _minRetryDelayMs.Set(value);
        }

        private static readonly __Value<bool?> _skipInstanceDeletePoll = new __Value<bool?>(() => __config.GetBoolean("skipInstanceDeletePoll"));
        /// <summary>
        /// Skip waiting for a linode_instance resource to finish deleting.
        /// </summary>
        public static bool? SkipInstanceDeletePoll
        {
            get => _skipInstanceDeletePoll.Get();
            set => _skipInstanceDeletePoll.Set(value);
        }

        private static readonly __Value<bool?> _skipInstanceReadyPoll = new __Value<bool?>(() => __config.GetBoolean("skipInstanceReadyPoll"));
        /// <summary>
        /// Skip waiting for a linode_instance resource to be running.
        /// </summary>
        public static bool? SkipInstanceReadyPoll
        {
            get => _skipInstanceReadyPoll.Get();
            set => _skipInstanceReadyPoll.Set(value);
        }

        private static readonly __Value<string?> _token = new __Value<string?>(() => __config.Get("token"));
        /// <summary>
        /// The token that allows you access to your Linode account
        /// </summary>
        public static string? Token
        {
            get => _token.Get();
            set => _token.Set(value);
        }

        private static readonly __Value<string?> _uaPrefix = new __Value<string?>(() => __config.Get("uaPrefix") ?? Utilities.GetEnv("LINODE_UA_PREFIX"));
        /// <summary>
        /// An HTTP User-Agent Prefix to prepend in API requests.
        /// </summary>
        public static string? UaPrefix
        {
            get => _uaPrefix.Get();
            set => _uaPrefix.Set(value);
        }

        private static readonly __Value<string?> _url = new __Value<string?>(() => __config.Get("url") ?? Utilities.GetEnv("LINODE_URL"));
        /// <summary>
        /// The HTTP(S) API address of the Linode API to use.
        /// </summary>
        public static string? Url
        {
            get => _url.Get();
            set => _url.Set(value);
        }

    }
}
